package Data;

public class EnumeratedData {

	public String enumeratedDataString(String dataType) {
		SimpleData sd = new SimpleData();
		if (dataType.equals("HLAboolean")) {
			return sd.simpleDataString("HLAinteger32BE");
		} else if (dataType.equals("OMT13boolean")
				|| dataType.equals("TransmitterOperationalstatusEnum8")
				|| dataType.equals("TransmitterOperationalStatusEnum8")
				|| dataType.equals("TransferTypeEnum8")
				|| dataType.equals("StopFreezeReasonEnum8")
				|| dataType.equals("ServiceTypeEnums")
				|| dataType.equals("RepairResultEmun8")
				|| dataType.equals("ReferenceSystemEnum8")
				|| dataType.equals("RadioInputSourceEnum8")
				|| dataType.equals("PropulsionPlantEnum8")
				|| dataType.equals("NomenclatureVersionEnum8")
				|| dataType.equals("MinefieldTypeEnum8")
				|| dataType.equals("MarkinEncodingEnum32")
				|| dataType.equals("IffOperationalParameter2Enu8")
				|| dataType.equals("IffOperationalParameter1Enum8")
				|| dataType.equals("IffApplicableModesEnum8")
				|| dataType.equals("IffAlternateMode4Enum8")
				|| dataType.equals("ForceIdentifierEnum8")
				|| dataType.equals("EnvironmentMOdelTypeEnum8")
				|| dataType.equals("EnvironmentGridTypeEnum8")
				|| dataType.equals("EnvironmentGridAxisTypeEnum8")
				|| dataType.equals("EmitterFunctionEnum8")
				|| dataType.equals("DetonationResultCodeEnum8")
				|| dataType.equals("DeadreckoningAlgorithmEnum8")
				|| dataType.equals("CollisionTypeEnum8")
				|| dataType.equals("AcknowledgementProtocolEnum8")
				|| dataType.equals("ActiveSonarFunctionCodeEnum8")
				|| dataType.equals("AggregateStateEnum8")
				|| dataType.equals("BeamFunctionCodeEnum8")
				|| dataType.equals("BreachedstatusEnum8")
				|| dataType.equals("MarkingEncodingEnum8")) {
			return sd.simpleDataString("HLAoctet");
		} else if (dataType.equals("AcknowledgeFlagEnum16")
				|| dataType.equals("UnmodulatedTypeEnum16")
				|| dataType.equals("WarheadTypeEnum16")
				|| dataType.equals("TacticalDataLinkTypeEnum16")
				|| dataType.equals("SpreadSpectrumEnum16")
				|| dataType.equals("RFModulationsystemTypeEnum16")
				|| dataType.equals("ResposeFlagEnum16")
				|| dataType.equals("RepairTypeEnum16")
				|| dataType.equals("ReceiveOperationalStatusEnum16")
				|| dataType.equals("PulseModulationTypeEnum16")
				|| dataType.equals("PassiveActivesEnum16")
				|| dataType.equals("NomenclatureEnum16")
				|| dataType.equals("MajorRFModulationTypeEnum16")
				|| dataType.equals("FuseTypeEnum16")
				|| dataType.equals("EnvironmentDataSampleTypeEnum16")
				|| dataType.equals("EnvronmentdataRepresentationEnum16")
				|| dataType.equals("EnvironmentDataCoordinatesystemEnum16")
				|| dataType.equals("EmitterTypeEnum16")
				|| dataType.equals("DesignatorCodeNameEnum16")
				|| dataType.equals("DesignatorCodeEnum16")
				|| dataType.equals("CryptographicSystemTypeEnum16")
				|| dataType.equals("ConstituentpartstationNameEnum16")
				|| dataType.equals("ConstituentPartPositionEnum16")
				|| dataType.equals("ConstituentPartNatureEnum16")
				|| dataType.equals("ConstituentPartNatureEnum")
				|| dataType.equals("CombinationModulationTypeEnum16")
				|| dataType.equals("ActiveSonarEnum16")
				|| dataType.equals("ActivesonarScanPatternEnum16")
				|| dataType.equals("AmplitudeAngelModulationTypeEnum16")
				|| dataType.equals("AmplitudeModulationTypeEnum16")
				|| dataType.equals("AngleModulationTypeEnum16")
				|| dataType.equals("AmplitudeAngleModulationTypeEnum16")) {
			return sd.simpleDataString("HLAinteger16BE");
		} else if (dataType.equals("ActionEnum32")
				|| dataType.equals("UserProtocolEnum32")
				|| dataType.equals("VisibleSideLocationEnum32")
				|| dataType.equals("WeaponStateEnum32")
				|| dataType.equals("TrailingEffectsCodeEnum32")
				|| dataType.equals("StationEnum32")
				|| dataType.equals("StanceCodeEnum32")
				|| dataType.equals("RequestStatusEnum32")
				|| dataType.equals("ParameterTypeEnum32")
				|| dataType.equals("OpacityCodeEnum32")
				|| dataType.equals("MinefieldsensorTypeEnum32")
				|| dataType.equals("MinefieldProtocolEnum8")
				|| dataType.equals("MinefieldPaintSchemeEnum32")
				|| dataType.equals("MinefieldFusingEnum32")
				|| dataType.equals("HatchStateEnum32")
				|| dataType.equals("FormationEnum32")
				|| dataType.equals("EventTypeEnum32")
				|| dataType.equals("EnvironmentRecordTypeEnum32")
				|| dataType.equals("EncodingTypeEnum32")
				|| dataType.equals("DatumIdentifierEnum32")
				|| dataType.equals("DamageStatusEnum32")
				|| dataType.equals("CryptographicModeEnum32")
				|| dataType.equals("ComplianceStateEnum32")
				|| dataType.equals("ActionResultEnum32")
				|| dataType.equals("AntennaPatternTypeEnum32")
				|| dataType.equals("ArticulatedPartsTypeEnum32")
				|| dataType.equals("ArticulatedTypeMetricEnum32")
				|| dataType.equals("CamouflageEnum32")
				|| dataType.equals("ChemicalContentEnum32")
				|| dataType.equals("HLAsyncPointStatus")
				|| dataType.equals("HLAswitch")
				|| dataType.equals("HLAfederateState") || dataType.equals("HLAtimeState")) {
			return sd.simpleDataString("HLAinteger32BE");
		} else {
			return sd.simpleDataString(dataType);
		}

	}
}
