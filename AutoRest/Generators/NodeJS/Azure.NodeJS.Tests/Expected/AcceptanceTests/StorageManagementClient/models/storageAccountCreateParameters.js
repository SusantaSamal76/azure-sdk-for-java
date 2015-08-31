/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the StorageAccountCreateParameters class.
 * @constructor
 */
function StorageAccountCreateParameters(parameters) {
  StorageAccountCreateParameters['super_'].call(this, parameters);
  if (parameters !== null && parameters !== undefined) {
    if (parameters['accountType'] !== null && parameters['accountType'] !== undefined) {
      this['accountType'] = parameters['accountType'];
    }
  }    
}

util.inherits(StorageAccountCreateParameters, models['Resource']);

/**
 * Validate the payload against the StorageAccountCreateParameters schema
 * @inheritdoc
 *
 * @param {JSON} payload
 *
 */
StorageAccountCreateParameters.prototype.serialize = function () {
  var payload = {};
  payload = StorageAccountCreateParameters['super_'].prototype.serialize.call(this);
  if (payload['id'] !== null && payload['id'] !== undefined && typeof payload['id'].valueOf() !== 'string') {
    throw new Error('payload[\'id\'] must be of type string.');
  }

  if (payload['name'] !== null && payload['name'] !== undefined && typeof payload['name'].valueOf() !== 'string') {
    throw new Error('payload[\'name\'] must be of type string.');
  }

  if (payload['type'] !== null && payload['type'] !== undefined && typeof payload['type'].valueOf() !== 'string') {
    throw new Error('payload[\'type\'] must be of type string.');
  }

  if (payload['location'] === null || payload['location'] === undefined || typeof payload['location'].valueOf() !== 'string') {
    throw new Error('payload[\'location\'] cannot be null or undefined and it must be of type string.');
  }

  if (payload['tags'] && typeof payload['tags'] === 'object') {
    for(var valueElement in payload['tags']) {
      if (payload['tags'][valueElement] !== null && payload['tags'][valueElement] !== undefined && typeof payload['tags'][valueElement].valueOf() !== 'string') {
        throw new Error('payload[\'tags\'][valueElement] must be of type string.');
      }
    }
  }

  if (payload['accountType']) {
    var allowedValues = [ 'Standard_LRS', 'Standard_ZRS', 'Standard_GRS', 'Standard_RAGRS', 'Premium_LRS' ];
    if (!allowedValues.some( function(item) { return item === payload['accountType']; })) {
      throw new Error(payload['accountType'] + ' is not a valid value. The valid values are: ' + allowedValues);
    }
  }
};

/**
 * Deserialize the instance to StorageAccountCreateParameters schema
 *
 * @param {JSON} instance
 *
 */
StorageAccountCreateParameters.prototype.deserialize = function (instance) {
  StorageAccountCreateParameters['super_'].prototype.deserialize.call(this, instance);
  return instance;
};

module.exports = StorageAccountCreateParameters;
