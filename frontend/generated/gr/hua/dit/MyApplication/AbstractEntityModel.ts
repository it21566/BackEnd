// @ts-nocheck

import AbstractEntity from './AbstractEntity';

import {ObjectModel,StringModel,NumberModel,ArrayModel,BooleanModel,Required,ModelValue,_getPropertyModel} from '@vaadin/form';

import {Email,Null,NotNull,NotEmpty,NotBlank,AssertTrue,AssertFalse,Negative,NegativeOrZero,Positive,PositiveOrZero,Size,Past,Future,Digits,Min,Max,Pattern,DecimalMin,DecimalMax} from '@vaadin/form';

/**
 * This module is generated from gr.hua.dit.MyApplication.AbstractEntity.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/AbstractEntity.java}
 */
export default class AbstractEntityModel<T extends AbstractEntity = AbstractEntity> extends ObjectModel<T> { 
  static createEmptyValue: () => AbstractEntity;

  get id(): NumberModel {
    return this[_getPropertyModel]('id', NumberModel, [true]);
  }
}
