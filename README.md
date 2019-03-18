# Val

2019 FIRST Robotics Destination: Deep Space robot for Team 5577 (Kinematic Wolves of Detroit Cristo Rey High School, working within DHDC/RECD)

## Why The Name Val?

- [Valentina Tereshkova](https://en.wikipedia.org/wiki/Valentina_Tereshkova) was a Soviet cosmonaut and the first woman in space, on theme for this year's game, and a celebration of women in STEM.
- [Valentina hot sauce](<https://en.wikipedia.org/wiki/Valentina_(hot_sauce)>) is amazing. Only somewhat related.

## What's New This Year?

- 📐 CTRE magnetic encoder–based PID control for the intake arm mechanism and the elevator mechanism. We're able to measure angles and heights fairly precisely, and move these mechanisms to desired setpoints. A major shout out to Ted of [Team 4680](https://www.thebluealliance.com/team/4680) (AzTech Eagles of César Chávez Academy in Detroit, MI, also working within DHDC/RECD) for the idea behind this PID control scheme.
- 🏑 Shuffleboard display of angle, height, and encoder count information. This was super handy for debugging encoder measurements even while the robot was disabled.
- 🎮 Joystick and D-pad buttons! We've wanted these in our control scheme for years, and we finally got these buttons working as input! A big thanks to [Team 1675](https://www.thebluealliance.com/team/1675) (UPS (Ultimate Protection Squad) of Milwaukee, WI) for the code example for `DPadButton`, and to [Team 2168](https://www.thebluealliance.com/team/2168) (Aluminum Falcons of Fitch High School in Groton, CT) for the code example for `JoystickAnalogButton`!
