import {
  requireNativeComponent,
  UIManager,
  Platform,
  TextProps,
  ColorValue,
} from 'react-native';

const LINKING_ERROR =
  `The package 'react-native-outlined-text' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo managed workflow\n';

interface OutlinedTextProps extends TextProps {
  outlineColor: ColorValue;
  outlineWidth?: number;
}

const ComponentName = 'OutlinedTextView';

export const OutlinedTextView =
  UIManager.getViewManagerConfig(ComponentName) != null
    ? requireNativeComponent<OutlinedTextProps>(ComponentName)
    : () => {
        throw new Error(LINKING_ERROR);
      };
