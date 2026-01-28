# CurseForge Publishing Guide

This mod can be published to CurseForge manually or through automated tools.

## Manual Upload

1. Go to [CurseForge](https://www.curseforge.com/minecraft/mc-mods)
2. Click "Create a Project"
3. Fill in the project details:
   - **Name**: Better Archeology Cataclysm Compat
   - **Summary**: Enables Soaring Winds enchantment on Ignitium Elytra
   - **Category**: Addon, Magic, Equipment
   - **Game Version**: 1.20.1
   - **Mod Loader**: Forge
4. Upload the JAR file from `build/libs/`
5. Add dependencies:
   - Better Archeology Reforged (Required)
   - L_Ender's Cataclysm (Required)

## Automated Publishing (Optional)

To set up automated CurseForge publishing:

1. Install the CurseForge Upload plugin in `build.gradle`:
   ```gradle
   plugins {
       id "com.matthewprenger.cursegradle" version "1.4.0"
   }
   ```

2. Add CurseForge configuration:
   ```gradle
   curseforge {
       apiKey = project.hasProperty('curseforge_api_key') ? project.curseforge_api_key : ''
       project {
           id = 'YOUR_PROJECT_ID' // Get this from your CurseForge project
           changelog = file('CHANGELOG.md')
           releaseType = 'release'
           addGameVersion '1.20.1'
           addGameVersion 'Forge'
           
           mainArtifact(jar) {
               displayName = "Better Archeology Cataclysm Compat v${version}"
               relations {
                   requiredDependency 'betterarcheology-reforged'
                   requiredDependency 'l-enders-cataclysm'
               }
           }
       }
   }
   ```

3. Set your CurseForge API key as a GitHub secret or in `gradle.properties`:
   ```properties
   curseforge_api_key=YOUR_API_KEY_HERE
   ```

4. Publish with:
   ```bash
   ./gradlew curseforge
   ```

## Description for CurseForge

Use the content from README.md as your project description on CurseForge.

## Screenshots

Consider adding these screenshots to your CurseForge page:
- Enchanting the Ignitium Elytra with Soaring Winds
- Flying with the enchanted armor showing the speed boost effect
- The enchantment in an enchanting table/anvil
