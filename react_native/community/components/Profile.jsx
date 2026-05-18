import { Image, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import face_01 from '@/assets/images/face-01.jpg'
import { colors } from '../constants/colorConstant'
import FontAwesome from '@expo/vector-icons/FontAwesome';

const Profile = () => {
  return (
    <View style={styles.container}>
      <View style={styles.profileContainer}>
        <Image 
          style={styles.img}
          source={face_01}
        />
        <View>
          <Text style={styles.writer}>작성자</Text>
          <Text style={styles.createDate}>2026-04-15</Text>
        </View>
      </View>
      <FontAwesome name="ellipsis-v" size={24} color="black" />
    </View>
  )
}

export default Profile

const styles = StyleSheet.create({
  container : {
    flexDirection : 'row',
    justifyContent : 'space-between',
    alignItems : 'center',
    paddingRight : 16,
    marginBottom : 10
  },
  profileContainer : {
    flexDirection : 'row',
    alignItems : 'center',
    gap : 8
  },
  img : {
    width : 50,
    height : 50,
    borderRadius : 50,
    borderWidth : StyleSheet.hairlineWidth,
    borderColor : colors.ORANGE_600 
  },
  writer : {
    fontSize : 14,
    fontWeight : 'bold'
  },
  createDate : {
    fontSize : 13,
    color : colors.GRAY_500
  }
})