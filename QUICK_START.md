# Quick Start: Setup for Publication

All placeholder text has been configured for **EarthKiii**.

## 1. Verify Build

```bash
./gradlew clean build
```

The JAR will be in `build/libs/betterarcheologycataclysmcompat-1.0.0.jar`

## 2. Initialize Git

```bash
git init
git add .
git commit -m "Initial commit: Better Archeology Cataclysm Compat v1.0.0"
```

## 3. Create GitHub Repository

1. Go to https://github.com/new
2. Name: `BetterArcheologyCataclysmCompat`
3. Public repository
4. Don't add README, .gitignore, or license (we have them)
5. Create repository

## 4. Push to GitHub

```bash
git branch -M main
git remote add origin https://github.com/EarthKiii/BetterArcheologyCataclysmCompat.git
git push -u origin main
```

## 5. Create GitHub Release

```bash
git tag -a v1.0.0 -m "Release v1.0.0"
git push origin v1.0.0
```

Or create manually on GitHub:
- Go to Releases → Draft a new release
- Tag: `v1.0.0`
- Upload the JAR from `build/libs/`

## 6. Publish to CurseForge

See `CURSEFORGE.md` for detailed instructions.

---

**That's it!** Your mod is ready for publication.

For detailed step-by-step instructions, see `PUBLISHING.md`.
