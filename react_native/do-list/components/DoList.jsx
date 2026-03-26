import { FlatList, Keyboard, StyleSheet, Text, TextInput, TouchableWithoutFeedback, View } from 'react-native'
import React, { useState } from 'react'
import { doData } from '../data/dummy'
import Task from './Task'

const DoList = () => {
  const [doList, setDoList] = useState(doData)

  //수정 중인 id 저장 state변수
  const [editingId, setEditingId] = useState(null) 

  //입력받은 할일 저장할 state변수
  const[task, setTask] = useState('')

  // 가장 큰 id 리턴 함수
  const maxId = () => {
    let max = 0
    for(let e of doList){
      if(e.id > max)
        max = e.id
    }
    return max+1
  }

  //input에 입력한 데이터 추가
  const addTask = () => {
    const newTask = {
      id : maxId(),
      item : task
    }
    setDoList(prev => [...prev, newTask])
    setTask('')
  }

  return (
    <TouchableWithoutFeedback onPress={Keyboard.dismiss}>
      <View style={{ flex: 1 }}>
        <TextInput
          style={styles.input}
          placeholder='+Add a Task'
          value={task}
          onChangeText={setTask}
          onSubmitEditing={addTask}
        />
        <View style={styles.listContainer}>
          <FlatList
            data={doList}
            renderItem={({item}) => <Task 
              item = {item} 
              setDoList = {setDoList}
              isEditing={editingId === item.id}
              setEditingId={setEditingId}  
            />}
            keyExtractor={item => item.id}
            contentContainerStyle={{
              gap : 10
            }}
            keyboardShouldPersistTaps="handled"
            ListEmptyComponent={
              <Text style={{ textAlign: 'center', color: '#999' }}>빈 리스트 입니다</Text>
            }
          />
        </View>
      </View>
    </TouchableWithoutFeedback>
  )
}

export default DoList

const styles = StyleSheet.create({
  listContainer:{
    marginHorizontal:'auto',
    padding : 12,
    backgroundColor : '#dddddd',
  },
  input : {
    borderWidth : 1,
    marginBottom : 30,
    borderColor : '#706161'
  }
})