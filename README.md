Image Reverse
=============

A simple Code to Reverse Image

## Before Reverse
<img src="readMeImage/ch.jpg" alt="Drawing" style="width: 250px;"/>

## After Reverse
<img src="readMeImage/ch2.jpg" alt="Drawing" style="width: 250px;"/>

## How to Use
You should write path of what you change picture At **targetPath**
```
// input path
String targetPath = "C:\\Users\\dsm_024\\Desktop\\ch.jpg";
```
You should write path of result picture At **outputPath**
```
// output path
String outputPath = "C:\\Users\\dsm_024\\Desktop\\chR.jpg";
```

## Vertical & Horizental
You can choice Vertical & Horizental.
If you want Horizental Reverse, put **true** parameter at flipImage Method
```
// put true to Horizental Reverse
flipImage(targetBuffer, true);
```
If you want Vertical Reverse, put **false** parameter at flipImage Method
```
// put true to HorizenVerticaltal Reverse
flipImage(targetBuffer, false);
```
