# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OpenapiPetstore.Model.OuterObjectWithEnumProperty do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :value
  ]

  @type t :: %__MODULE__{
    :value => OpenapiPetstore.Model.OuterEnumInteger.t
  }
end

defimpl Poison.Decoder, for: OpenapiPetstore.Model.OuterObjectWithEnumProperty do
  import OpenapiPetstore.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:value, :struct, OpenapiPetstore.Model.OuterEnumInteger, options)
  end
end

