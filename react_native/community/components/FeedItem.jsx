import { StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import { Pressable } from 'react-native'
import FontAwesome from '@expo/vector-icons/FontAwesome';
import Profile from './Profile';
import { colors } from '../constants/colorConstant';

const FeedItem = ({item}) => {
  //좋아요 상태 변수
  const [isLike, setIsLike] = useState(false)

  return (
    <View style={styles.feedContainer}>
      <Profile />
      <Text style={styles.title}>{item.title}</Text>
      <Text style={styles.content}>게시글 내용</Text>
      <View style={styles.iconContainer}>
        <Pressable style={styles.menu}>
          <FontAwesome name={isLike ? "heart" : "heart-o"} size={24} color="red" />
          <Text>3</Text>
        </Pressable>
        <Pressable style={styles.menu}>
          <FontAwesome name="commenting-o" size={24} color="black" />
          <Text>3</Text>
        </Pressable>
        <Pressable style={styles.menu}>
          <FontAwesome name="eye" size={24} color="black" />
          <Text>3</Text>
        </Pressable>
      </View>
    </View>
  )
}

export default FeedItem

const styles = StyleSheet.create({
  feedContainer : {
    backgroundColor : 'white',
    padding : 16
  },
  title : {
    fontSize : 16,
    marginBottom : 12
  },
  content : {
    fontSize : 16,
    color : colors.GRAY_600,
    marginBottom : 12
  },
  iconContainer : {
    flexDirection : 'row',
    justifyContent : 'space-around',
    alignItems : 'center',
    borderTopWidth : StyleSheet.hairlineWidth,
    borderTopColor : colors.GRAY_300
  },
  menu : {
    flexDirection : 'row',
    justifyContent : 'center',
    alignItems : 'center',
    gap : 5,
    paddingTop : '16'
  }
})