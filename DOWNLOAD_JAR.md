# Download ServerVox JAR

## Your JAR is Ready!

The compiled mod JAR is located at: `releases/servervox-1.0.0.jar`

## How to Get It

### Method 1: Rebuild It Yourself (Recommended)
This ensures you have the latest version:

```bash
# Clone your repository
git clone https://github.com/12132234/servervox.git
cd servervox

# Build the mod
./gradlew build

# Your JAR is now at: build/libs/servervox-1.0.0.jar
```

### Method 2: From the Pull Request
1. Go to: https://github.com/12132234/servervox/pull/1
2. Navigate to the branch: `fabric-1.21.1-setup`
3. Look in the `releases/` folder
4. Download `servervox-1.0.0.jar`

### Method 3: Direct Branch Access
1. Go to: https://github.com/12132234/servervox
2. Switch to branch: `fabric-1.21.1-setup`
3. Navigate to `releases/servervox-1.0.0.jar`
4. Click "Download" or "Raw"

### Method 4: Use GitHub CLI (if installed)
```bash
gh repo clone 12132234/servervox
cd servervox
git checkout fabric-1.21.1-setup
ls releases/servervox-1.0.0.jar
```

## Verify Your Download

After downloading, verify it's a valid JAR:
```bash
file servervox-1.0.0.jar
# Should output: servervox-1.0.0.jar: Zip archive data, at least v2.0 to extract

unzip -l servervox-1.0.0.jar
# Should show: META-INF/MANIFEST.MF
```

## Installation

Once you have the JAR:
1. Copy to your Minecraft 1.21.1 server's `mods/` folder
2. Install Fabric Loader 0.16.9+
3. Install Fabric API 0.116.6+1.21.1
4. Start server

See `HOW_TO_RUN.md` for detailed instructions.
