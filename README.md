# mockito-postfix-plugin

IntelliJ plugin to add postfix completion template for [Mockito](http://mockito.org/).

This plugin is inspired by [assertj-postfix-plugin](https://github.com/tokuhirom/assertj-postfix-plugin).

## Install

https://plugins.jetbrains.com/plugin/8150

![](./images/download-plugin.png)

## Usage

### org.mockito.Mockito

- `mock` completion
  - `.mock` will complete `org.mockito.Mockito.mock`
- `spy` completion
  - `.spy` will complete `org.mockito.Mockito.spy`
- `when` completion
  - `.when` will complete `org.mockito.Mockito.when`
- `verify` completion
  - `.verify` will complete `org.mockito.Mockito.verify`
- `doReturn` completion
  - `.doReturn` will complete `org.mockito.Mockito.doReturn`
- `doNothing` completion
  - `.doNothing` will complete `org.mockito.Mockito.doNothing`
- `doThrow` completion
  - `.doThrow` will complete `org.mockito.Mockito.doThrow`
- `doCallRealMethod` completion
  - `.doCallRealMethod` will complete `org.mockito.Mockito.doCallRealMethod`

![](./images/mockito-postfix-plugin-demo.gif)

### org.mockito.BDDMockito

- `given` completion
  - `.given` will complete `org.mockito.BDDMockito.given`
- `then` completion
  - `.then` will complete `org.mockito.BDDMockito.then`
- `will` completion
  - `.will` will complete `org.mockito.BDDMockito.will`
- `willAnswer` completion
  - `.willAnswer` will complete `org.mockito.BDDMockito.willAnswer`
- `willDoNothing` completion
  - `.willDoNothing` will complete `org.mockito.BDDMockito.willDoNothing`
- `willReturn` completion
  - `.willReturn` will complete `org.mockito.BDDMockito.willReturn`
- `willThrow` completion
  - `.willThrow` will complete `org.mockito.BDDMockito.willThrow`
- `willCallRealMethod` completion
  - `.willCallRealMethod` will complete `org.mockito.BDDMockito.willCallRealMethod`

## Develop

```sh
./gradlew runIde
./gradlew buildPlugin
```

## Publish

```sh
./gradlew publishPlugin
```

## LICENSE

MIT
