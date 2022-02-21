// @ts-nocheck

import AbstractEntityModel from '../AbstractEntityModel';
import CompanyModel from './CompanyModel';
import StatusModel from './StatusModel';
import Contact from './Contact';

import {ObjectModel,StringModel,NumberModel,ArrayModel,BooleanModel,Required,ModelValue,_getPropertyModel} from '@vaadin/form';

import {Email,Null,NotNull,NotEmpty,NotBlank,AssertTrue,AssertFalse,Negative,NegativeOrZero,Positive,PositiveOrZero,Size,Past,Future,Digits,Min,Max,Pattern,DecimalMin,DecimalMax} from '@vaadin/form';

/**
 * This module is generated from gr.hua.dit.MyApplication.Entities.Contact.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/Entities/Contact.java}
 */
export default class ContactModel<T extends Contact = Contact> extends AbstractEntityModel<T> {
  static createEmptyValue: () => Contact;

  get firstName(): StringModel {
    return this[_getPropertyModel]('firstName', StringModel, [true, new NotEmpty()]);
  }

  get lastName(): StringModel {
    return this[_getPropertyModel]('lastName', StringModel, [true, new NotEmpty()]);
  }

  get company(): CompanyModel {
    return this[_getPropertyModel]('company', CompanyModel, [true, new NotNull()]);
  }

  get status(): StatusModel {
    return this[_getPropertyModel]('status', StatusModel, [true, new NotNull()]);
  }

  get email(): StringModel {
    return this[_getPropertyModel]('email', StringModel, [true, new NotEmpty(), new Email()]);
  }
}
