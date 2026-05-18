import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useLocalSearchParams } from 'expo-router'

const DetailScreen = () => {
  //페이지 이동 시 전달되는 데이터 받기(객체로 전달 받음)
  const params = useLocalSearchParams()


  
  return (
    <View>
      <Text>detail</Text>
      <Text>{params.id}</Text>
      <Text>{params.age}</Text>
    </View>
  )
}

export default DetailScreen

const styles = StyleSheet.create({})