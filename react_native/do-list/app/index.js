import { StyleSheet, Text } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import DoList from '../components/DoList'

const HomeScreen = () => {
  return (
    <SafeAreaView style={styles.container}>
      <Text style={{fontSize : 30, marginBottom : 30}}>To Do List</Text>
      <DoList/>
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