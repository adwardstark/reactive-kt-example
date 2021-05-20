import React, {Component} from 'react';
import {
  StyleSheet,
  TouchableOpacity,
  Text,
  View,
  NativeModules,
} from 'react-native';
const {RNReactiveKT} = NativeModules;

class App extends Component {
  state = {
    count: 0,
  };

  onPressShowNativeToastDirectly = () => {
    RNReactiveKT.showNativeToastDirectly('Toast from Native', 2000);
  };

  onPressShowNativeToastUsingNativeLib = () => {
    RNReactiveKT.showNativeToastDirectly('Toast from Native-Library', 2000);
  };

  render() {
    return (
      <View style={styles.container}>
        <TouchableOpacity
          style={styles.button}
          onPress={this.onPressShowNativeToastDirectly}>
          <Text>showNativeToastDirectly</Text>
        </TouchableOpacity>
        <TouchableOpacity
          style={styles.button}
          onPress={this.onPressShowNativeToastUsingNativeLib}>
          <Text>showNativeToastUsingNativeLib</Text>
        </TouchableOpacity>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  button: {
    alignItems: 'center',
    backgroundColor: '#DDDDDD',
    padding: 10,
    marginBottom: 10,
  },
});

export default App;
