package com.vonage.sample.serversdk.springboot;

import com.vonage.client.voice.TextToSpeechLanguage;

@lombok.Data
public class VoiceCallParams {
	public TextToSpeechLanguage language;
	public String toPstn, tts, callId;
	public boolean premium;
	public Integer ringTimer;
}