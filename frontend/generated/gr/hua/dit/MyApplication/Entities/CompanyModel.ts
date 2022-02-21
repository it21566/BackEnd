// @ts-nocheck

import AbstractEntityModel from '../AbstractEntityModel';
import ContactModel from './ContactModel';
import Company from './Company';

import {ObjectModel,StringModel,NumberModel,ArrayModel,BooleanModel,Required,ModelValue,_getPropertyModel} from '@vaadin/form';

import {Email,Null,NotNull,NotEmpty,NotBlank,AssertTrue,AssertFalse,Negative,NegativeOrZero,Positive,PositiveOrZero,Size,Past,Future,Digits,Min,Max,Pattern,DecimalMin,DecimalMax} from '@vaadin/form';

/**
 * This module is generated from gr.hua.dit.MyApplication.Entities.Company.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/Entities/Company.java}
 */
export default class CompanyModel<T extends Company = Company> extends AbstractEntityModel<T> {
  static createEmptyValue: () => Company;

  get name(): StringModel {
    return this[_getPropertyModel]('name', StringModel, [true, new NotBlank()]);
  }

  get employees(): ArrayModel<ModelValue<ContactModel>, ContactModel> {
    return this[_getPropertyModel]('employees', ArrayModel, [true, ContactModel, [true]]);
  }

  get employeeCount(): NumberModel {
    return this[_getPropertyModel]('employeeCount', NumberModel, [false]);
  }
}
