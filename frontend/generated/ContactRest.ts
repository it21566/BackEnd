/**
 * This module is generated from ContactRest.java
 * All changes to this file are overridden. Please consider to make changes in the corresponding Java file if necessary.
 * @see {@link file:///C:/Users/Ody/Desktop/MyApplication/src/main/java/gr/hua/dit/MyApplication/RestApi/ContactRest.java}
 * @module ContactRest
 */

// @ts-ignore
import client from './connect-client.default';
import type ResponseEntity from './org/springframework/http/ResponseEntity';

function _findContact(
 id: number | undefined
): Promise<ResponseEntity | undefined> {
 return client.call('ContactRest', 'findContact', {id});
}

function _findContacts(): Promise<ResponseEntity | undefined> {
 return client.call('ContactRest', 'findContacts');
}
export {
  _findContact as findContact,
  _findContacts as findContacts,
};
