package it.unitn.disi.peng.process.engine.service;

import android.content.Context;
import android.view.View;

public abstract class Service {
	public static final String FORM_SERVICE = "it.unitn.disi.peng.process.engine.service.FormService";
	public static final String EMAIL_SERVICE = "it.unitn.disi.peng.process.engine.service.EmailService";
		
	public abstract View getView(Context context);
}
