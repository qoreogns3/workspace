import { Keyboard, StyleSheet, Text, TextInput, TouchableWithoutFeedback, View } from 'react-native'
import React, { useState } from 'react'
import { member_data } from '../data/member'
import { FlatList } from 'react-native'
import KoreaMember from './KoreaMember'


const MemberList = () => {
  const [memberList, setMemberList] = useState(member_data)
  //수정 중인 id 저장 state변수
  const [editingId, setEditingId] = useState(null) 

  //입력받은 이름 저장할 state변수
  const[name, setName] = useState('')
  
  // 가장 큰 id 리턴 함수
  const maxId = () => {
    let max = 0
    for(let e of memberList){
      if(e.id > max)
        max = e.id
    }
    return max+1
  }

  //input에 입력한 데이터 추가
  const addMember = () => {
    const newMember = {
      id : maxId(),
      item : name
    }
    setMemberList(prev => [...prev, newMember])
    setName('')
  }

  return (
  <TouchableWithoutFeedback onPress={Keyboard.dismiss}>
    <View style={{ flex: 1 }}>
      <TextInput
        style={styles.input}
        placeholder='선수 이름 입력'
        value={name}
        onChangeText={setName} // text => setName(text)
        onSubmitEditing={addMember}
      />
      <View style={styles.listContainer}>
        <FlatList
          data={memberList}
          renderItem={({item}) => <KoreaMember 
            item = {item} 
            setMemberList = {setMemberList}
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

export default MemberList

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