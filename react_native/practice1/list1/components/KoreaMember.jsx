import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import MaterialIcons from '@expo/vector-icons/MaterialIcons';

const KoreaMember = ({item}) => {
  return (
    <View style={styles.itemContainer}>
      <Text style={styles.title}>{item.item}</Text>
      <MaterialIcons 
        name="delete-forever" 
        size={24} 
        color="black"
        style={styles.icon} 
      />
      <MaterialIcons 
        name="edit" 
        size={24} 
        color="black"
        style={styles.icon} 
      />
    </View>
  )
}

export default KoreaMember

const styles = StyleSheet.create({
  itemContainer : {
    backgroundColor : '#eeeeee' ,
    flexDirection : 'row',
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
  }
})