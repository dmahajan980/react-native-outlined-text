# react-native-outlined-text

> :warning: This is a work in progress. Use with caution.

Native text component that enables text outline/stroke in React Native.

## Installation

```sh
npm install react-native-outlined-text
```

## Usage

```js
import { OutlinedTextView } from 'react-native-outlined-text';

// ...

<OutlinedTextView outlineColor="#000000" outlineWidth={5}>
  This text is outlined
</OutlinedTextView>;
```

## Props

`OutlinedTextView` extends React Native's core [`Text`](https://reactnative.dev/docs/text)
component and adds two new props to it.

| Prop Name    | Type       | Required | Default Value |
| ------------ | ---------- | -------- | ------------- |
| outlineColor | ColorValue | true     | N/A           |
| outlineWidth | number     | false    | 2             |

All the remaining props are same as [`Text` component props](https://reactnative.dev/docs/text#props).

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT) -
see the [LICENSE file](./LICENSE) for details.

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
