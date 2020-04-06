-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema coaches
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema coaches
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `coaches` DEFAULT CHARACTER SET utf8 ;
USE `coaches` ;

-- -----------------------------------------------------
-- Table `coaches`.`coaches`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `coaches`.`coaches` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first name` VARCHAR(50) NOT NULL,
  `last name` VARCHAR(50) NOT NULL,
  `year of birth` YEAR NOT NULL,
  `gender` VARCHAR(1) NOT NULL,
  `sport` VARCHAR(45) NOT NULL,
  `diet` VARCHAR(45) NOT NULL,
  `certificate` VARCHAR(255) NULL,
  `rating` TINYINT NOT NULL,
  `email adress` VARCHAR(255) NOT NULL,
  `phone number` VARCHAR(255) NOT NULL,
  `description` TEXT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `phone number_UNIQUE` (`phone number` ASC) VISIBLE,
  UNIQUE INDEX `email adress_UNIQUE` (`email adress` ASC) VISIBLE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
