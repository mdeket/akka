package com.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

//@SpringBootApplication
public class AkkaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AkkaApplication.class, args);

		final ActorSystem system = ActorSystem.create();
		final ActorRef botMaster = system.actorOf(Props.create(BotMaster.class),"botMaster");
//		final ActorRef akkaBot = system.actorOf(Props.create(AkkaBot.class),"akkaBot");

		botMaster.tell(new BotMaster.StartChildBots(), ActorRef.noSender());

//		akkaBot.tell(new AkkaBot.Move(AkkaBot.Direction.FORWARD), akkaBot);
//		akkaBot.tell(new AkkaBot.Move(AkkaBot.Direction.BACKWARD), ActorRef.noSender());
//		akkaBot.tell(new AkkaBot.Stop(), ActorRef.noSender());
	}
}
