# ServerVox - Fabric 1.21.1 Server-Side Mod

A server-side mod for Minecraft 1.21.1 using Fabric.

## 🎯 Features
- Server-side only functionality
- Built for Minecraft 1.21.1
- Uses Fabric API
- Example mixin included

## 📋 Requirements
- Java 21 or higher
- Minecraft 1.21.1
- Fabric Loader 0.16.9 or higher
- Fabric API 0.116.6+1.21.1 or higher

## 🔧 Development Setup

### Building the Mod
1. Clone this repository
2. Open a terminal in the project root
3. Run: `./gradlew build` (Linux/Mac) or `gradlew.bat build` (Windows)
4. The built JAR will be in `build/libs/`

### Testing in Development
Run the development server:
```bash
./gradlew runServer
```

### Project Structure
```
servervox/
├── src/
│   ├── main/
│   │   ├── java/com/servervox/
│   │   │   ├── ServerVox.java          # Main mod class
│   │   │   └── mixin/
│   │   │       └── ExampleMixin.java   # Example mixin
│   │   └── resources/
│   │       ├── fabric.mod.json         # Mod metadata
│   │       └── servervox.mixins.json   # Mixin configuration
│   └── client/
│       └── java/com/servervox/
│           └── ServerVoxClient.java    # Client entrypoint (minimal)
├── build.gradle                        # Build configuration
├── gradle.properties                   # Version properties
└── settings.gradle                     # Gradle settings
```

## 📦 Installation

### For Players
1. Install Fabric Loader 0.16.9+ for Minecraft 1.21.1
2. Download Fabric API 0.116.6+1.21.1 or higher
3. Place both Fabric API and this mod's JAR in your `mods/` folder
4. Launch the game

### For Server Owners
1. Install Fabric server for Minecraft 1.21.1
2. Place Fabric API and this mod in the server's `mods/` folder
3. Start the server

## 🛠️ Configuration

This mod is server-side only and designed to work without client-side installation.

## 🔍 Verified Compatibility

This mod has been configured with the following **verified** versions for Minecraft 1.21.1:

- **Minecraft**: 1.21.1
- **Yarn Mappings**: 1.21.1+build.3
- **Fabric Loader**: 0.16.9
- **Fabric API**: 0.116.6+1.21.1
- **Fabric Loom**: 1.8-SNAPSHOT
- **Java**: 21
- **Gradle**: 8.14.5

These versions are confirmed to work together for Fabric 1.21.1 development.

## 📝 License

This project is licensed under the MIT License.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.