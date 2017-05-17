package com.example.eventsource;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.persistence.AbstractPersistentActor;
import akka.persistence.SnapshotOffer;
import lombok.Value;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by kiki on 5/17/17.
 */
//@MyWay
public class AkkaEventSourcing {

    @Value
    public class Command {
        String name;
        Optional<String> description;
    }

    @Value
    public class Event {
        String name;
        Optional<String> description;
    }

    @Value
    public class MyState {
        String name;
    }


    class ExamplePersistentActor extends AbstractPersistentActor {

        @Override
        public String persistenceId() {
            return "unique-pid-for-this";
        }

        @Override
        public Receive createReceiveRecover() {
            return null;
        }

        @Override
        public Receive createReceive() {
            return null;
        }
    }
}
