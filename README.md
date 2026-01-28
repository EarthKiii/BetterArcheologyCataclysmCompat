# Better Archeology Cataclysm Compat

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Minecraft](https://img.shields.io/badge/Minecraft-1.20.1-green.svg)](https://www.minecraft.net/)
[![Forge](https://img.shields.io/badge/Forge-47.3.0+-orange.svg)](https://files.minecraftforge.net/)

A lightweight Minecraft Forge 1.20.1 compatibility mod that enables the **Soaring Winds** enchantment from [Better Archeology Reforged](https://www.curseforge.com/minecraft/mc-mods/betterarcheology-reforged) to work with the **Ignitium Elytra Chestplate** from [L_Ender's Cataclysm](https://www.curseforge.com/minecraft/mc-mods/l_enders-cataclysm).

## Features

- ✅ Allows Soaring Winds enchantment to be applied to the Ignitium Elytra Chestplate
- ✅ Better Archeology's existing flight boost automatically works with the Ignitium Elytra
- ✅ Simple, lightweight compatibility layer using a single Mixin
- ✅ No additional configuration needed

## Requirements

- **Minecraft**: 1.20.1
- **Forge**: 47.3.0 or higher
- **Better Archeology Reforged**: Any version for 1.20.1
- **L_Ender's Cataclysm**: Any version for 1.20.1

## Installation

1. Download and install the required mods:
   - [Better Archeology Reforged](https://www.curseforge.com/minecraft/mc-mods/betterarcheology-reforged)
   - [L_Ender's Cataclysm](https://www.curseforge.com/minecraft/mc-mods/l_enders-cataclysm)
2. Download this compatibility mod
3. Place all mod files in your `mods` folder
4. Launch Minecraft with Forge 1.20.1

## How It Works

This mod uses a single, focused Mixin to extend enchantment compatibility:

**SoaringWindsEnchantmentMixin**: Modifies the Soaring Winds enchantment's `canEnchant` method to also accept the Ignitium Elytra Chestplate as a valid target.

Once the enchantment is applied, Better Archeology's existing flight boost mechanics automatically work with the Ignitium Elytra - no additional code needed!

## Building from Source

```bash
# Clone the repository
git clone https://github.com/EarthKiii/BetterArcheologyCataclysmCompat.git
cd BetterArcheologyCataclysmCompat

# Download dependency JARs
# Place Better Archeology and Cataclysm JAR files in the libs/ folder
# See libs/README.md for download links

# Build with Gradle
./gradlew build

# The compiled JAR will be in build/libs/
```

## Configuration

This mod uses Better Archeology's existing configuration. No additional config is needed.

To adjust Soaring Winds settings:
1. Open `.minecraft/config/betterarcheology-common.toml`
2. Modify the following values:
   - `artifactsEnabled` - Enable/disable artifact enchantments
   - `soaringWindsEnabled` - Enable/disable Soaring Winds specifically
   - `soaringWindsBoost` - Adjust the flight speed multiplier

## License

This mod is released under the MIT License. See LICENSE file for details.

## Credits

- **Better Archeology Reforged** by [Pandarix](https://www.curseforge.com/members/pandarix)
- **L_Ender's Cataclysm** by [L_Ender](https://www.curseforge.com/members/l_ender)

Special thanks to the Forge modding community for their excellent documentation and tools.

### Development

This mod was developed with the assistance of:
- **Claude Sonnet 4.5** - AI-powered code generation and architecture design
- **GitHub Copilot** - Code completion and suggestions

## Support

For issues, please open a ticket on the [GitHub Issues page](https://github.com/EarthKiii/BetterArcheologyCataclysmCompat/issues).

## Contributing

Contributions are welcome! Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for a list of changes in each version.
