SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `mydb` ;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Usuario` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `userUsuario` VARCHAR(45) NOT NULL,
  `passUsuario` VARCHAR(20) NOT NULL,
  `nomUsuario` VARCHAR(15) NOT NULL,
  `apeUsuario` VARCHAR(15) NOT NULL,
  `dirUsuario` VARCHAR(45) NOT NULL,
  `pregUsuario` VARCHAR(45) NOT NULL,
  `emailUsuario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE INDEX `userUsuario_UNIQUE` (`userUsuario` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Sector`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Sector` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Sector` (
  `idSector` INT NOT NULL AUTO_INCREMENT,
  `descSector` VARCHAR(45) NULL,
  `nomSector` VARCHAR(45) NULL,
  PRIMARY KEY (`idSector`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Apartamento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Apartamento` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Apartamento` (
  `idApartamento` INT NOT NULL AUTO_INCREMENT,
  `dirApartamento` VARCHAR(45) NOT NULL,
  `descApartamento` VARCHAR(45) NOT NULL,
  `statApartamento` VARCHAR(45) NOT NULL,
  `costApartamento` FLOAT NOT NULL,
  `Sector_idSector` INT NOT NULL,
  PRIMARY KEY (`idApartamento`),
  INDEX `fk_Apartamento_Sector1_idx` (`Sector_idSector` ASC),
  CONSTRAINT `fk_Apartamento_Sector1`
    FOREIGN KEY (`Sector_idSector`)
    REFERENCES `mydb`.`Sector` (`idSector`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Comentario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Comentario` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Comentario` (
  `idComentario` INT NOT NULL AUTO_INCREMENT,
  `descComentario` VARCHAR(45) NOT NULL,
  `calComentario` VARCHAR(45) NULL,
  `Usuario_idUsuario` INT NOT NULL,
  `Apartamento_idApartamento` INT NOT NULL,
  `fechComentario` DATETIME NOT NULL,
  PRIMARY KEY (`idComentario`),
  INDEX `fk_Comentario_Usuario_idx` (`Usuario_idUsuario` ASC),
  INDEX `fk_Comentario_Apartamento1_idx` (`Apartamento_idApartamento` ASC),
  CONSTRAINT `fk_Comentario_Usuario`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comentario_Apartamento1`
    FOREIGN KEY (`Apartamento_idApartamento`)
    REFERENCES `mydb`.`Apartamento` (`idApartamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Intencion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Intencion` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Intencion` (
  `idIntencion` INT NOT NULL,
  `Usuario_idUsuario` INT NOT NULL,
  `Apartamento_idApartamento` INT NOT NULL,
  PRIMARY KEY (`idIntencion`),
  INDEX `fk_Intencion_Usuario1_idx` (`Usuario_idUsuario` ASC),
  INDEX `fk_Intencion_Apartamento1_idx` (`Apartamento_idApartamento` ASC),
  CONSTRAINT `fk_Intencion_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Intencion_Apartamento1`
    FOREIGN KEY (`Apartamento_idApartamento`)
    REFERENCES `mydb`.`Apartamento` (`idApartamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
