// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Simple no path and body param spec
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.0
 */

package petstoreserver

import (
	"context"
	"net/http"
	"errors"
)

// BothAPIService is a service that implements the logic for the BothAPIServicer
// This service should implement the business logic for every endpoint for the BothAPI API.
// Include any external packages or services that will be required by this service.
type BothAPIService struct {
}

// NewBothAPIService creates a default api service
func NewBothAPIService() *BothAPIService {
	return &BothAPIService{}
}

// Both - summary
func (s *BothAPIService) Both(ctx context.Context, pathParam string, bodyRequest BodyRequest) (ImplResponse, error) {
	// TODO - update Both with the required logic for this service method.
	// Add api_both_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("Both method not implemented")
}
