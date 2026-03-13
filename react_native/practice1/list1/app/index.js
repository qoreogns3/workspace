import { StyleSheet, Text } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import MemberList from '../components/MemberList'

const HomeScreen = () => {
  return (
    <SafeAreaView style={styles.container}>
      <Text style={{fontSize : 30, marginBottom : 30}}>한국 선수</Text>
      
      <MemberList/>
    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({
  container: {
    padding : 16,
    flex : 1
  }
})