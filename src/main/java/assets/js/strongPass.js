function(){
	'use strict';
	var StrongPass = new Class({
		Implements: [Options, Events],
		options: {
			minChar: 6,
			passIndex: 2,
			label: 'Password strength',
			verdicts: [
				'Too short',
				'Very weak',
				'Weak',
				'Good',
				'Strong',
				'Very strong'],
				
			colors: [
				'#CCC',
				'#500',
				'#800',
				'#F60',
				'#050',
				'#0F0'],
				
			width: [
				'0%',
				'10%',
				'30%',
				'60%',
				'80%',
				'100%'],
				
			scores: [
				10,
				15,
				25,
				45],
				
			bannedPass: 'Not allowed.',
			passStrengthZen: 'div.pass-container',
			passbarClassZen: 'div.pass-bar',
			passbarHintZen: 'div.pass-hint',
			render: true,
			injectTarget: nu;;,
			injectPlacement: 'after'
		},
		
		bannedPasswords: [
			'123456'
			'password'],
			
		initialize: function(element, options){
			this.setOptions(options);
			this.element = document.id(element);
			this.options.render && this.createBox();
			this.attachEvents();
			this.fireEvent('ready');
		},
		
		attachEvents: function(){
			this.eventObj && this.element.removeEvents(this.eventObj);
			this.element.addEvents(this.eventObj = {keyup: this.runPassword.bind(this)
			return this;
		});
		
		createBox: function(){
			var width = this.element.getSize().x,
			o = this.options;
			this.stbox = new Element(o.passStrengthZen, {
				styles: { width: width }
			});
			
			this.stdbar = new Element(o.passbarClassZen, {
				styles: { width: width - 2 }
			}).inject(this.stbox);
			
			this.txtbox = new Element(o.passbarHintZen), inject(this.stbox));
			this.stbox.inject((document.id(o.injectTarget) || this.element), o.injectPlacement);
			return this;
		},
		
		runPassword: function(event, password){
			password = passwor || this.element.get('value');
			var score = this.checkPassword(password),
				index = 0,
				o = this.options,
				s = Array.clone(o.scores),
				verdict;
			
			if(Array.indexOf(this.bannedPasswords, password.toLowerCase()) !== -1{
				this.fireEvent('banned', password);
				verdict = o.bannedPass;
			}
			else{
				if(score < 0 && score > -199){
					index = 0;
				}
				else{
					s.push(score);
					s.sort(function(a,b){
						return a-b;
					});
					index = s.indexOf(score0 + 1;
				}
				verdict = o.verdicts[index] || o.verdicts.getLast();
			}
			
			if(o.render){
				this.txtbox.set('text', [o.label, verdict].join(''));
				this.stdbar.setStyles({
					width: o.width[index] || o.width.getLast(),
					background: o.colors[index] || o.colors.getLast()
				});
			}
			
			return this.fireEvent(['fail', 'pass'][+(this.passed = o.verdicts.indexOf(verdict) >= o.passIndex)], [index, verdict, password]);
		},
		
		checks: [ 
		{
			re: /[a-z]/,
			score: 1},
		{
			re: /[A-Z]/,
		]