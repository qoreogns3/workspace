import { StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import MaterialIcons from '@expo/vector-icons/MaterialIcons';
import { TextInput } from 'react-native';

const KoreaMember = ({item ,setMemberList, isEditing, setEditingId}) => {
  //아이콘 클릭시 실행할 삭제 함수
  const deleteMember = (id) => {
    setMemberList(prev => prev.filter(e => e.id !== id))
  }

  //수정 이름 저장 state변수
  const [editName, setEditName] = useState(item.item)

  const updateMember = () => {
    setMemberList(prev => prev.map(e => e.id === item.id ? {...e, item : editName} : e))
    setEditingId(null)
  }
  
  return (
    <View style={styles.itemContainer}>
      {
        isEditing ? 
        <TextInput
          style={styles.input}
          value={editName}
          onChangeText={setEditName}
          onSubmitEditing={updateMember}
          onBlur={updateMember}
          autoFocus
        /> :
        <View style={styles.textContainer}>
          <Text style={styles.title}>{item.item}</Text>
          <MaterialIcons 
            name="delete-forever" 
            size={24} 
            color="black"
            style={styles.icon}
            onPress={() => deleteMember(item.id)}
          />
          <MaterialIcons 
            name="edit" 
            size={24} 
            color="black"
            style={styles.icon} 
            onPress={() => setEditingId(item.id)}
          />
        </View>
      }
    </View>
  )
}

export default KoreaMember

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
    height:24,
    padding:0
  },
  
  textContainer:{
    width : '100%',
    flexDirection : 'row'
  }
})