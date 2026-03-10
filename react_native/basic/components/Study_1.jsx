
import { StyleSheet, Text, TextInput, View } from 'react-native'
import { Pressable } from 'react-native';

const Study_1 = () => {
  return (
    <View>
      <View>
        <Text>아이디</Text>
        <TextInput 
          style={styles.input}
          //TextInput의 onChange 함수의 매개변수는 입력한 데이터를 의미
          onChangeText={text => {
            console.log(text)
            setId(text)
          }} 

          onChange={e => {
            console.log(1)
            console.log(e.nativeEvent.text)
          }}
        />
      </View>
      {/* 버튼 */}
      <Pressable 
        onPress={e => {alert(1)}}
        style={styles.btnContainer}
      >
        <Text style={styles.btn}>버튼</Text>
      </Pressable>
    </View>
  )
}

export default Study_1

const styles = StyleSheet.create({
  input : {
    borderWidth : 1,
    borderColor : 'blue',
    borderRadius : 10
  },
  btnContainer : {
    backgroundColor : 'blue',
    width : '20%',
    height : 34,
    padding : 5,
    justifyContent : 'center',
    alignItems : 'center'
  },
  btn : {
    color : 'white'
  }
})