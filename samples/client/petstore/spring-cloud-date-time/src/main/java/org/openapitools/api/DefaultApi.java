/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "Default", description = "the Default API")
public interface DefaultApi {

    /**
     * GET /thingy/{date}
     *
     * @param date A date path parameter (required)
     * @param dateTime A date-time query parameter (required)
     * @param xOrderDate A date header parameter (required)
     * @param loginDate A date cookie parameter (optional, default to 1975-01-01)
     * @return OK (status code 200)
     */
    @ApiOperation(
        value = "",
        nickname = "get",
        notes = ""
    )
    @ApiResponses({
        @ApiResponse(code = 200, message = "OK")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/thingy/{date}"
    )
    ResponseEntity<Void> get(
        @ApiParam(value = "A date path parameter", required = true, defaultValue = "1972-01-01") @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
        @NotNull @ApiParam(value = "A date-time query parameter", required = true, defaultValue = "1973-12-19T03:39:57-08:00") @Valid @RequestParam(value = "dateTime", required = true, defaultValue = "1973-12-19T03:39:57-08:00") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime dateTime,
        @NotNull @ApiParam(value = "A date header parameter", required = true, defaultValue = "1974-01-01") @RequestHeader(value = "X-Order-Date", required = true, defaultValue = "1974-01-01") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate xOrderDate,
        @ApiParam(value = "A date cookie parameter", defaultValue = "1975-01-01") @CookieValue(name = "loginDate", required = false, defaultValue = "1975-01-01") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate loginDate
    );


    /**
     * POST /thingy/{date}
     * update with form data
     *
     * @param date A date path parameter (required)
     * @param visitDate Updated last vist timestamp (optional, default to 1971-12-19T03:39:57-08:00)
     * @return Invalid input (status code 405)
     */
    @ApiOperation(
        value = "",
        nickname = "updatePetWithForm",
        notes = "update with form data"
    )
    @ApiResponses({
        @ApiResponse(code = 405, message = "Invalid input")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/thingy/{date}",
        consumes = "application/x-www-form-urlencoded"
    )
    ResponseEntity<Void> updatePetWithForm(
        @ApiParam(value = "A date path parameter", required = true, defaultValue = "1970-01-01") @PathVariable("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
        @ApiParam(value = "Updated last vist timestamp", defaultValue = "1971-12-19T03:39:57-08:00") @Valid @RequestParam(value = "visitDate", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime visitDate
    );

}
