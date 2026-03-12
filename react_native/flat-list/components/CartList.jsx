import { FlatList, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import { dummy_data } from '../data/dummy'
import CartItem from './CartItem'

const CartList = () => {
  const [CartList, setCartList] = useState(dummy_data) 
  
  return (
    <View style={styles.listContainer}>
      <FlatList 
        //반복할 데이터
        data={CartList}

        //반복해서 그릴 그림
        renderItem={({item}) => <CartItem item = {item}/>} 

        //map함수의 key속성괴 동일
        keyExtractor={item => item.id}

        //반복적으로 그려지는 컴포넌트를 감싸는 전체 영역 디자인
        contentContainerStyle={{
          gap : 10
        }}
      />
    </View>
  )
}

export default CartList

const styles = StyleSheet.create({
  listContainer:{
    width : '90%',
    marginHorizontal:'auto',
    padding : 12,
    backgroundColor : '#dddddd',
  }
})