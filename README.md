# java-lotto-precourse

## Overview

- this project is Korean Lotto machine service.
- you can play simple simulation Korean Lotto.

## function

### Lotto relation

- generate 6 numbers randomly , non-duplicated from 1 to 45 and sorted in ascending,
   - [x] generate random number from 1 to 45
   - [x] generate randomly 6 numbers
   - [x] validate numbers **whether number is duplicated or not** 
   - [x] sort numbers in ascending order
- manage Internal Lotto data
   - [x] verify duplicated numbers

- provide interface for Lotto Data
   - [x] return stored Lotto data
   - [x] return matched Prize Tier by comparing winning numbers
   - [ ] create empty Lotto Data

- manage Lotto Prize Tier
   - [x] return matched Prize Tier


### Lotto Machine relation

- provide interface for Machine service logic
  - [ ] create Lotto more than ones