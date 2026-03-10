import { StyleSheet, TextInput, View, Text, Pressable } from 'react-native'
import React, { useState } from 'react'

const Study_2 = () => {
  const [id, setId] = useState({
    id : '',
    password : ''
  })
  const [isShow, setisShow] = useState(false)

  const handleLoginData = (name, text) => {
    setId({
      ...id,
      [name] : text
    })
  }

  return (
    <View style={styles.study2_container}>
      <View>
        <TextInput
          style={styles.input}
          value={id.id}
          placeholder='Input Your ID'
          onChangeText={text => handleLoginData('id', text)}
        />
        <TextInput
          style={styles.input}
          value={id.password}
          secureTextEntry={true}
          placeholder='Input Your Password'
          onChangeText={text => handleLoginData('password', text)}
        />
      </View>
      <Pressable style={styles.btnDiv}
        onPress={e => {isShow ? setisShow(false) : setisShow(true)}}
      >
        <Text style={styles.btn}>로그인</Text>
      </Pressable>
      {isShow && 
        <View>
          <Text>아이디 : {id.id}</Text>
          <Text>비밀번호 : {id.password}</Text>
        </View>
      }
    </View>
  )
}

export default Study_2

const styles = StyleSheet.create({
  study2_container : {
    width : '80%',
    margin : 'auto'
    // paddingTop : 200,
    // paddingHorizontal : 30
    // paddingHorizontal : 좌우 패딩
    // paddingVertical : 수직 패딩
  },
  input : {
    borderWidth : 1,
    borderColor : 'gray',
    marginBottom : 10,
    borderRadius : 10
  },
  btnDiv : {
    backgroundColor : 'red',
    height : 40,
    justifyContent : 'center',
    alignItems : 'center',
    borderRadius : 10
  },
  btn : {
    color : 'white',
    fontWeight : 'bold'
  }
})