
import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native-safe-area-context'
import CartList from '../components/CartList'

const HomeScreen = () => {
  return (
    <SafeAreaView>
      <CartList/>
    </SafeAreaView>
  )
}

export default HomeScreen

const styles = StyleSheet.create({})