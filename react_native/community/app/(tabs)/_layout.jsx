import { Tabs } from 'expo-router';
import React from 'react';
import FontAwesome from '@expo/vector-icons/FontAwesome';


export default function TabLayout() {

  return (
    <Tabs
      screenOptions={{
        headerShown: false,
      }}>
      <Tabs.Screen
        name="(home)"
        options={{
          title: 'Home',
          tabBarIcon : () => <FontAwesome name="home" size={24} color="black" />
        }}
      />
      <Tabs.Screen
        name="profile"
        options={{
          title: 'profile',
          tabBarIcon : () => <FontAwesome name="user" size={24} color="black" />
        }}
      />
    </Tabs>
  );
}
