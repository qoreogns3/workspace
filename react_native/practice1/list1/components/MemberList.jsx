import { StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import { member_data } from '../data/member'
import { FlatList } from 'react-native'
import KoreaMember from './KoreaMember'


const MemberList = () => {
  const [memberList, setMemberList] = useState(member_data)

  //입력받은 이름 저장할 state변수
  const[name, setName] = useState('')

  const addMember = () => {
    const newMember = {
      id : 4,
      item : name
    }
    setMemberList(prev => [...prev, newMember])
    setName('')
  }

  return (
    <View>
      <TextInput
        style={styles.input}
        placeholder='선수 이름 입력'
        value={name}
        onChangeText={setName}
        onSubmitEditing={addMember}
      />
      <View style={styles.listContainer}>
        
        <FlatList
          data={memberList}
          renderItem={({item}) => <KoreaMember item = {item}/>}
          keyExtractor={item => item.id}
          contentContainerStyle={{
            gap : 10
          }}
        />
      </View>
    </View>
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