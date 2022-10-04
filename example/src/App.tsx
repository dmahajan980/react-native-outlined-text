import * as React from 'react';

import { StyleSheet, View } from 'react-native';
import { OutlinedTextView } from 'react-native-outlined-text';

export default function App() {
  return (
    <View style={styles.container}>
      <OutlinedTextView outlineColor="#000">Hi</OutlinedTextView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
