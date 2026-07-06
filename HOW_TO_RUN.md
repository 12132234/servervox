# How to Run ServerVox Mod

## ⚠️ Important: This is a Minecraft Mod, NOT a Standalone Application

You **cannot** run this JAR with `java -jar servervox-1.0.0.jar`. This will give you an error like "can't access jarfile" or "no main manifest attribute".

## ✅ Correct Ways to Use This Mod

### Option 1: Install on a Minecraft 1.21.1 Server (Production)

**Requirements:**
- Minecraft Server 1.21.1
- Fabric Server Loader 0.16.9+
- Fabric API 0.116.6+1.21.1

**Steps:**
1. **Build the mod** (if not already built):
   ```bash
   cd /projects/sandbox/servervox
   ./gradlew build
   ```

2. **Copy the JAR to your server:**
   ```bash
   # The built JAR is at:
   # build/libs/servervox-1.0.0.jar
   
   # Copy it to your Minecraft server's mods folder:
   cp build/libs/servervox-1.0.0.jar /path/to/your/minecraft/server/mods/
   ```

3. **Install Fabric API:**
   - Download from: https://modrinth.com/mod/fabric-api/version/0.116.6+1.21.1
   - Place `fabric-api-0.116.6+1.21.1.jar` in your server's `mods/` folder

4. **Start your Minecraft server normally:**
   ```bash
   java -jar fabric-server-launch.jar
   ```

### Option 2: Test in Development Environment

Use Gradle to run a test server with the mod loaded:

```bash
cd /projects/sandbox/servervox
./gradlew runServer
```

This will:
- Download Minecraft server files
- Set up a development environment
- Load your mod automatically
- Start a test server

**Note:** First run will take a while as it downloads Minecraft assets.

### Option 3: Build and Download

If you want to use the mod on your own computer:

1. **Build the mod:**
   ```bash
   cd /projects/sandbox/servervox
   ./gradlew build
   ```

2. **Find the JAR:**
   - Location: `build/libs/servervox-1.0.0.jar`
   - Download this file

3. **Install on your Minecraft server:**
   - Copy to server's `mods/` folder
   - Ensure Fabric Loader and Fabric API are installed
   - Restart server

## 🚫 Why "java -jar" Doesn't Work

Minecraft mods are **libraries** that extend Minecraft, not standalone programs. They:
- ❌ Don't have a `main()` method
- ❌ Can't run independently
- ✅ Must be loaded by Fabric Loader
- ✅ Run inside the Minecraft server

## 📦 What's in the JAR?

The JAR contains:
- Mod classes (ServerVox.java, mixins, etc.)
- Mod metadata (fabric.mod.json)
- Resources and configuration

It's designed to be **loaded by Fabric**, not executed directly.

## 🐛 Troubleshooting

### "Can't access jarfile"
- ✅ **Solution:** Don't run with `java -jar`. Use one of the methods above.

### "No main manifest attribute"
- ✅ **Solution:** This confirms it's a mod JAR. Install it in a Fabric server.

### "Mod won't load in game"
- Check you have Fabric Loader 0.16.9+ installed
- Check you have Fabric API in the mods folder
- Check server logs for errors
- Verify Minecraft version is 1.21.1

## 📚 Additional Resources

- [Fabric Installation Guide](https://fabricmc.net/use/)
- [Fabric Server Setup](https://fabricmc.net/use/server/)
- See `README.md` for full project documentation
- See `QUICKSTART.md` for build commands
