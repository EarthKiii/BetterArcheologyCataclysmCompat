# Publishing Guide

This guide covers how to publish Better Archeology Cataclysm Compat to GitHub and CurseForge.

## Prerequisites

- [ ] Project builds successfully (`./gradlew build`)
- [ ] Testing completed with both mods installed
- [ ] Version number updated in `gradle.properties`
- [ ] Changelog updated in `CHANGELOG.md`
- [ ] README is accurate and complete

## Publishing to GitHub

### Initial Setup

1. **Create a new repository on GitHub**
   - Go to https://github.com/new
   - Name: `BetterArcheologyCataclysmCompat`
   - Description: "Compatibility mod for Better Archeology and Cataclysm (Minecraft 1.20.1)"
   - Make it public
   - Don't initialize with README (we already have one)

2. **Update repository URLs**
   - Replace `EarthKiii` in the following files if you need to change it:
     - `README.md`
     - `src/main/resources/META-INF/mods.toml`
     - `gradle.properties`

3. **Initialize Git and push**
   ```bash
   cd "C:\Users\jonas\Documents\.Random Dev\compat mod\proj"
   git init
   git add .
   git commit -m "Initial commit: Better Archeology Cataclysm Compat v1.0.0"
   git branch -M main
   git remote add origin https://github.com/EarthKiii/BetterArcheologyCataclysmCompat.git
   git push -u origin main
   ```

### Creating a Release

1. **Tag the release**
   ```bash
   git tag -a v1.0.0 -m "Release v1.0.0"
   git push origin v1.0.0
   ```

2. **GitHub Actions will automatically:**
   - Build the project
   - Create a GitHub Release
   - Attach the JAR file

3. **Or create manually:**
   - Go to your repository's "Releases" page
   - Click "Draft a new release"
   - Tag: `v1.0.0`
   - Title: `v1.0.0 - Initial Release`
   - Description: Copy from `CHANGELOG.md`
   - Upload the JAR from `build/libs/`
   - Click "Publish release"

## Publishing to CurseForge

### Create the Project

1. Go to https://www.curseforge.com/minecraft/mc-mods
2. Click "Create a Project"
3. Fill in details:
   - **Name**: Better Archeology Cataclysm Compat
   - **Summary**: Enables the Soaring Winds enchantment to work with Ignitium Elytra
   - **Category**: 
     - Primary: Addon
     - Additional: Magic, Equipment
   - **Description**: Copy from README.md
   - **Logo**: Create/upload a 256x256 logo (optional)

### Upload the Mod

1. Navigate to "Files" tab
2. Click "Upload File"
3. Select the JAR from `build/libs/betterarcheologycataclysmcompat-1.0.0.jar`
4. Set details:
   - **Display Name**: Better Archeology Cataclysm Compat 1.0.0
   - **Game Version**: Minecraft 1.20.1
   - **Mod Loader**: Forge
   - **Release Type**: Release
   - **Changelog**: Copy from CHANGELOG.md

5. **Set Dependencies**:
   - Click "Relations"
   - Add required dependencies:
     - Better Archeology Reforged (Required)
     - L_Ender's Cataclysm (Required)

6. Click "Upload"

### Post-Publication

1. **Add screenshots** showing:
   - The enchantment being applied
   - Flying with the enchanted Ignitium Elytra
   - The speed boost effect

2. **Set up project links**:
   - Source: Link to GitHub repository
   - Issues: Link to GitHub Issues

3. **Configure project settings**:
   - Enable "Allow comments"
   - Set up Discord integration (optional)

## Automated Publishing (Advanced)

See `CURSEFORGE.md` for instructions on setting up automated CurseForge publishing through Gradle.

## Maintenance

### For Future Releases

1. Update version in `gradle.properties`
2. Update `CHANGELOG.md`
3. Build and test: `./gradlew build`
4. Commit changes
5. Tag the release: `git tag -a v1.x.x -m "Release v1.x.x"`
6. Push: `git push && git push --tags`
7. Upload to CurseForge (or use automated publishing)

## Support

After publishing, monitor:
- GitHub Issues
- CurseForge comments
- Discord (if you set one up)

Respond to bug reports and feature requests promptly!
