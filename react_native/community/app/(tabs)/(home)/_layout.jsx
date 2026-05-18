import { ActivityIndicator, StyleSheet, Text, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { Stack, useRouter } from 'expo-router'
import * as SecureStore from 'expo-secure-store'

const HomeLayout = () => {
  const router = useRouter()

  //로딩 중 여부를 판단하는 변수
  const [isLoading, setIsLoading] = useState(true);
  const [isLogin, setIsLogin] = useState(false);

  //로그인 여부 체크
  useEffect(() => {
    //SecureStore에 저장된 토큰 가져오기
    checkLogin()
  }, []);

  //로그인 여부에 따라 페이지 설정
  useEffect(()=>{
    if(isLoading) return

    if(!isLoading){
      router.replace('')
    }
  }, [])

  const checkLogin = async () => {
    const result = await SecureStore.getItemAsync('accessToken')

    if(result){
      setIsLogin(true)
    }
    setIsLoading(false)
  }

  if(isLoading){
    return (
      <View style = {styles.indicator}>
        <ActivityIndicator />
      </View>
    )
  }

  return (
    <Stack screenOptions={{headerShown : false}}/> 
  )
}

export default HomeLayout

const styles = StyleSheet.create({
  indicator : {
    flex : 1,
    justifyContent : 'center',
    alignItems : 'center'
  }
})