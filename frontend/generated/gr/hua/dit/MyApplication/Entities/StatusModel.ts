// @ts-nocheck

import AbstractEntityModel from '../AbstractEntityModel';
import Status from './Status';

import {ObjectModel,StringModel,NumberModel,ArrayModel,BooleanModel,Required,ModelValue,_getPropertyModel} from '@vaadin/form';

import {Email,Null,NotNull,NotEmpty,NotBlank,AssertTrue,AssertFalse,Negative,NegativeOrZero,Positive,PositiveOrZero,Size,Past,Future,Digits,Min,Max,Pattern,DecimalMin,DecimalMax} from '@vaadin/form';

/**
 * This module is generated from gr.hua.dit.MyApplication.Entities.Status.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/Entities/Status.java}
 */
export default class StatusModel<T extends Status = Status> extends AbstractEntityModel<T> {
  static createEmptyValue: () => Status;

  get name(): StringModel {
    return this[_getPropertyModel]('name', StringModel, [true]);
  }
}
