# Publication Checklist ✅

Use this checklist to ensure your mod is ready for publication.

## Pre-Publication

- [ ] **Code Quality**
  - [ ] No compilation errors
  - [ ] No critical warnings
  - [ ] Code follows Java conventions
  - [ ] All files properly commented

- [ ] **Testing**
  - [ ] Mod loads without crashes
  - [ ] Soaring Winds can be applied to Ignitium Elytra
  - [ ] Flight boost works correctly
  - [ ] No conflicts with other mods
  - [ ] Tested in both single-player and multiplayer (if applicable)

- [ ] **Documentation**
  - [ ] README.md is complete and accurate
  - [ ] CHANGELOG.md is up to date
  - [ ] All placeholder text replaced (already done: EarthKiii)
  - [ ] Version number is correct
  - [ ] License file exists

- [ ] **Build**
  - [ ] `./gradlew clean build` completes successfully
  - [ ] JAR file is generated in `build/libs/`
  - [ ] JAR file size is reasonable (~50KB expected)

## GitHub Publication

- [ ] **Repository Setup**
  - [ ] GitHub repository created
  - [ ] Repository is public
  - [ ] Description set
  - [ ] Topics added (minecraft, forge, mod, compatibility)
  
- [ ] **Content**
  - [ ] All files committed to Git
  - [ ] .gitignore properly configured
  - [ ] License file included
  - [ ] README displays correctly on GitHub

- [ ] **Release**
  - [ ] Version tagged (e.g., v1.0.0)
  - [ ] GitHub Release created
  - [ ] JAR file attached to release
  - [ ] Release notes from CHANGELOG included

## CurseForge Publication

- [ ] **Project Setup**
  - [ ] CurseForge project created
  - [ ] Project name matches mod name
  - [ ] Summary is concise and informative
  - [ ] Description is complete (use README content)
  - [ ] Categories selected (Addon, Magic, Equipment)
  - [ ] Logo uploaded (optional but recommended)

- [ ] **File Upload**
  - [ ] JAR file uploaded
  - [ ] Game version set to 1.20.1
  - [ ] Mod loader set to Forge
  - [ ] Release type set correctly (Release/Beta/Alpha)
  - [ ] Changelog included

- [ ] **Dependencies**
  - [ ] Better Archeology Reforged marked as Required
  - [ ] L_Ender's Cataclysm marked as Required
  - [ ] Forge version requirement set

- [ ] **Media**
  - [ ] Screenshots added (recommended: 3-5 images)
  - [ ] Images show key features
  - [ ] Images are clear and well-lit

## Post-Publication

- [ ] **Monitoring**
  - [ ] GitHub Issues enabled and monitored
  - [ ] CurseForge comments enabled
  - [ ] Ready to respond to bug reports

- [ ] **Promotion**
  - [ ] Posted in relevant Discord servers (if applicable)
  - [ ] Shared on Reddit r/feedthebeast (if appropriate)
  - [ ] Social media announcement (optional)

## Before Next Update

- [ ] Version bumped in gradle.properties
- [ ] CHANGELOG.md updated with new version
- [ ] All changes tested
- [ ] Tagged and released on GitHub
- [ ] Updated on CurseForge

---

**Notes:**
- Keep your API keys and tokens secure
- Respond to issues and comments professionally
- Keep documentation up to date with each release
- Consider user feedback for future improvements
