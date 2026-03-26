import { Alert, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import MaterialIcons from '@expo/vector-icons/MaterialIcons'


const Task = ({item, setDoList, isEditing, setEditingId}) => {
  
  
  // 버튼 두개 alert실행 함수
  const createTwoButtonAlert = (id) =>
    Alert.alert('삭제', '정말 삭제 하시겠습니까?', [
      {
        text: 'Cancel',
        onPress: () => {},
        style: 'cancel',
      },
      {
        text: 'OK', 
        onPress: () => {setDoList(prev => prev.filter(e => e.id !== id))}
      },
    ]);
    
  //아이콘 클릭시 실행할 삭제 함수
  const deleteList = (id) => {
    createTwoButtonAlert(id)
  }

  //수정 내용 저장 state변수
  const [editList, setEditList] = useState(item.item)

  //수정 시 실행할 함수
  const updateList = () => {
    setDoList(prev => prev.map(e => e.id === item.id ? {...e, item : editList} : e))
    setEditingId(null)
  }

  //빈 곳 클릭시 수정 취소 함수
  const updateList1 = () => {
    setDoList(prev => prev)
    setEditList(item.item)
    setEditingId(null)
  }
  

  return (
    <View style={styles.itemContainer}>
      {
        isEditing ? 
        <TextInput
          style={styles.input}
          value={editList}
          onChangeText={setEditList}
          onSubmitEditing={updateList}
          onBlur={updateList1}
          autoFocus
        /> :
        <View style={styles.textContainer}>
          <Text style={styles.title}>{item.item}</Text>
          <MaterialIcons 
            name="edit" 
            size={24} 
            color="black"
            style={styles.icon} 
            onPress={() => setEditingId(item.id)}
          />
          <MaterialIcons 
            name="delete-forever" 
            size={24} 
            color="black"
            style={styles.icon}
            onPress={() => deleteList(item.id)}
          />
        </View>
      }
    </View>
  )
}

export default Task

const styles = StyleSheet.create({
  itemContainer : {
    backgroundColor : '#eeeeee' ,
    paddingVertical : 10,
    paddingHorizontal : 12,
    alignItems : 'center',
  },

  title : {
    width : '80%',
    fontSize : 20
  },

  icon : {
    width : '10%'
  },

  input: {
    width: '100%',
    fontSize: 20,
    borderWidth: 1,
    borderBottomColor: '#282b28',
    height:32,
    padding:0
  },
  
  textContainer:{
    width : '100%',
    flexDirection : 'row'
  }
})