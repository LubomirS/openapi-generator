# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import unittest

import unit_test_api
from unit_test_api.model.enums_in_properties import EnumsInProperties
from unit_test_api import configuration


class TestEnumsInProperties(unittest.TestCase):
    """EnumsInProperties unit test stubs"""
    _configuration = configuration.Configuration()

    def test_missing_optional_property_is_valid_passes(self):
        # missing optional property is valid
        EnumsInProperties._from_openapi_data(
            {
                "bar":
                    "bar",
            },
            _configuration=self._configuration
        )

    def test_wrong_foo_value_fails(self):
        # wrong foo value
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            EnumsInProperties._from_openapi_data(
                {
                    "foo":
                        "foot",
                    "bar":
                        "bar",
                },
                _configuration=self._configuration
            )

    def test_both_properties_are_valid_passes(self):
        # both properties are valid
        EnumsInProperties._from_openapi_data(
            {
                "foo":
                    "foo",
                "bar":
                    "bar",
            },
            _configuration=self._configuration
        )

    def test_wrong_bar_value_fails(self):
        # wrong bar value
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            EnumsInProperties._from_openapi_data(
                {
                    "foo":
                        "foo",
                    "bar":
                        "bart",
                },
                _configuration=self._configuration
            )

    def test_missing_all_properties_is_invalid_fails(self):
        # missing all properties is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            EnumsInProperties._from_openapi_data(
                {
                },
                _configuration=self._configuration
            )

    def test_missing_required_property_is_invalid_fails(self):
        # missing required property is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            EnumsInProperties._from_openapi_data(
                {
                    "foo":
                        "foo",
                },
                _configuration=self._configuration
            )


if __name__ == '__main__':
    unittest.main()
