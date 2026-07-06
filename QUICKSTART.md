# Quick Start Guide - ServerVox Fabric Mod

## ✅ Verified Working Configuration

This project has been **tested and confirmed working** with Minecraft Fabric 1.21.1.

### Build Status
✅ **Successfully Built** - The mod compiles without errors and generates a valid JAR file.

## 🚀 Quick Commands

### Build the Mod
```bash
./gradlew build
```
Output: `build/libs/servervox-1.0.0.jar`

### Clean Build
```bash
./gradlew clean build
```

### Run Development Server
```bash
./gradlew runServer
```

## 📦 What You Get

After building, you'll find in `build/libs/`:
- `servervox-1.0.0.jar` - The main mod file
- `servervox-1.0.0-sources.jar` - Source code jar

## 🎯 Installation

### For Minecraft 1.21.1 Server:
1. Install Fabric Server Loader 0.16.9+
2. Download Fabric API 0.116.6+1.21.1 from [Modrinth](https://modrinth.com/mod/fabric-api/version/0.116.6+1.21.1)
3. Place both `fabric-api-0.116.6+1.21.1.jar` and `servervox-1.0.0.jar` in your server's `mods/` folder
4. Start your server

## 🔧 Development

### Project Structure
```
src/
├── main/
│   ├── java/com/servervox/
│   │   ├── ServerVox.java              # Main entry point
│   │   └── mixin/ExampleMixin.java     # Example mixin
│   └── resources/
│       ├── fabric.mod.json              # Mod metadata
│       └── servervox.mixins.json        # Mixin config
└── client/
    └── java/com/servervox/
        └── ServerVoxClient.java         # Client entry (minimal)
```

### Adding Features

1. **Add a new class** in `src/main/java/com/servervox/`
2. **Add a mixin** in `src/main/java/com/servervox/mixin/` and register it in `servervox.mixins.json`
3. **Add resources** in `src/main/resources/`

### Rebuild After Changes
```bash
./gradlew clean build
```

## 📋 Dependencies Verified

All dependencies are confirmed compatible:
- ✅ Minecraft 1.21.1
- ✅ Fabric Loader 0.16.9
- ✅ Fabric API 0.116.6+1.21.1
- ✅ Yarn Mappings 1.21.1+build.3
- ✅ Java 21+
- ✅ Gradle 8.14.5

## 🐛 Troubleshooting

### "Unsupported class file major version"
- Ensure you're using Java 21 or higher
- Run: `java -version` to check

### Build fails with dependency errors
- Delete `.gradle` folder and rebuild:
  ```bash
  rm -rf .gradle
  ./gradlew clean build
  ```

### Mod doesn't load in game
- Check that Fabric API is installed
- Verify Fabric Loader version is 0.16.9+
- Check server logs for errors

## 📝 Next Steps

1. Customize `ServerVox.java` with your mod logic
2. Add event handlers using Fabric API
3. Create mixins for vanilla modifications
4. Test in development environment: `./gradlew runServer`
5. Build final JAR: `./gradlew build`

## 🎉 Success!

Your mod is ready to use! The JAR file at `build/libs/servervox-1.0.0.jar` can be placed directly in any Minecraft 1.21.1 Fabric server's mods folder.
