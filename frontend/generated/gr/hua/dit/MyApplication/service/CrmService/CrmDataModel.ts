// @ts-nocheck

import CompanyModel from '../../Entities/CompanyModel';
import ContactModel from '../../Entities/ContactModel';
import StatusModel from '../../Entities/StatusModel';
import CrmData from './CrmData';

import {ObjectModel,StringModel,NumberModel,ArrayModel,BooleanModel,Required,ModelValue,_getPropertyModel} from '@vaadin/form';

import {Email,Null,NotNull,NotEmpty,NotBlank,AssertTrue,AssertFalse,Negative,NegativeOrZero,Positive,PositiveOrZero,Size,Past,Future,Digits,Min,Max,Pattern,DecimalMin,DecimalMax} from '@vaadin/form';

/**
 * This module is generated from gr.hua.dit.MyApplication.service.CrmService.CrmData.
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/service/CrmService.java}
 */
export default class CrmDataModel<T extends CrmData = CrmData> extends ObjectModel<T> { 
  static createEmptyValue: () => CrmData;

  get contacts(): ArrayModel<ModelValue<ContactModel>, ContactModel> {
    return this[_getPropertyModel]('contacts', ArrayModel, [false, ContactModel, [false]]);
  }

  get companies(): ArrayModel<ModelValue<CompanyModel>, CompanyModel> {
    return this[_getPropertyModel]('companies', ArrayModel, [false, CompanyModel, [false]]);
  }

  get statuses(): ArrayModel<ModelValue<StatusModel>, StatusModel> {
    return this[_getPropertyModel]('statuses', ArrayModel, [false, StatusModel, [false]]);
  }
}
