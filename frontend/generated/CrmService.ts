/**
 * This module is generated from CrmService.java
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/service/CrmService.java}
 * @module CrmService
 */

// @ts-ignore
import client from './connect-client.default';
import type Company from './gr/hua/dit/MyApplication/Entities/Company';
import type Contact from './gr/hua/dit/MyApplication/Entities/Contact';
import type Status from './gr/hua/dit/MyApplication/Entities/Status';
import type CrmData from './gr/hua/dit/MyApplication/service/CrmService/CrmData';

function _countContacts(): Promise<number> {
 return client.call('CrmService', 'countContacts');
}

function _deleteContact(
 contact: Contact | undefined
): Promise<void> {
 return client.call('CrmService', 'deleteContact', {contact});
}

function _findAllCompanies(): Promise<Array<Company | undefined> | undefined> {
 return client.call('CrmService', 'findAllCompanies');
}

function _findAllContacts(
 stringFilter: string | undefined
): Promise<Array<Contact | undefined> | undefined> {
 return client.call('CrmService', 'findAllContacts', {stringFilter});
}

function _findAllStatuses(): Promise<Array<Status | undefined> | undefined> {
 return client.call('CrmService', 'findAllStatuses');
}

function _getCrmData(): Promise<CrmData> {
 return client.call('CrmService', 'getCrmData');
}

function _saveContact(
 contact: Contact | undefined
): Promise<Contact> {
 return client.call('CrmService', 'saveContact', {contact});
}
export {
  _countContacts as countContacts,
  _deleteContact as deleteContact,
  _findAllCompanies as findAllCompanies,
  _findAllContacts as findAllContacts,
  _findAllStatuses as findAllStatuses,
  _getCrmData as getCrmData,
  _saveContact as saveContact,
};
