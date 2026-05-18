import { FlatList, Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useCallback, useEffect } from 'react'
import FeedItem from '../../../components/FeedItem'
import { dummyData } from '../../../api/dummyData'
import { colors } from '../../../constants/colorConstant'
import { Ionicons } from '@expo/vector-icons'
import { useFocusEffect, useRouter } from 'expo-router'
import axios from 'axios'

// 피드 목록
const HomeScreen = () => {
  const getData = () => {
    axios.get('http://192.168.30.111:8080/members/t1')
    .then(response => {
      console.log(response.data)
    })
    .catch(e => console.log(e))
  }

  //앱에서 페이지 전환 될때마다 실행
  useFocusEffect(useCallback(() => {
    getData()
  }, []));

  const router = useRouter()
  //조회한 피드 목록 데이터
  const feedList = dummyData;

  return (
    <View style={{ flex: 1 }}>
      <FlatList
        //반복할 데이터  
        data={feedList}  
        //무엇을 반복으로 그릴거냐
        //매개변수 item : 데이터 하나하나
        renderItem={(item) => <FeedItem item={item}/>}
        //map함수의 key와 동일  
        keyExtractor={(item) => item.id}
        //디자인
        contentContainerStyle={styles.listContainer}
      />
      <Pressable
        style = {({pressed}) => [styles.writeBtn, pressed && styles.pressed]}
        onPress={e => router.push('/reg-feed')}
      >
        <Ionicons name='pencil-outline' size={24} color='white'/>
      </Pressable>
    </View>
  )
}

export default HomeScreen

const styles = StyleSheet.create({
  listContainer : {
    paddingVertical : 8,
    paddingHorizontal : 8,
    gap : 10,
    backgroundColor : colors.GRAY_200
  },

  writeBtn : {
    position: 'absolute',
    bottom: 30,
    right: 20,
    width: 56,
    height: 56,
    borderRadius: 28,
    backgroundColor: colors.GRAY_200, // 브랜드 색상으로 교체 권장
    justifyContent: 'center',
    alignItems: 'center',
    shadowColor: '#000',
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.3,
    shadowRadius: 4,
    elevation: 5,
  },

  pressed : {
    opacity : 0.8
  }
})