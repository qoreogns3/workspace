import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useRouter } from 'expo-router'
import { SafeAreaView } from 'react-native'

//앱 실행 시 최초 보이는 컴포넌트
const HomeScreen = () => {

  //react-native에서 페이지 이동 시 사용하는 객체
  const router = useRouter()

  return (
    <SafeAreaView>
      
      <Text>index</Text>

      <Pressable onPress={e => router.push('/detail')}>
        <Text>상세 페이지</Text>
      </Pressable>

      <Pressable onPress={e => router.push({
        pathname : '/detail',
        params : {id : 'abc', age : 20}
      })}>
        <Text>상세 페이지</Text>
      </Pressable>

      <Pressable onPress={e => router.replace('/my-page')}>
        <Text>마이 페이지</Text>
      </Pressable>

    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})